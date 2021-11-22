package pt.uma.arq.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Game extends ApplicationAdapter {
    private SpriteBatch batch;
    private BackgroundManagement backgroundManagement;
    private BitmapFont font;

    @Override
    public void create() {
        Gdx.graphics.setWindowedMode(1280, 720);
        batch = new SpriteBatch();

        backgroundManagement = new BackgroundManagement(batch);
        font = new BitmapFont(Gdx.files.internal("gamefont.fnt"),
                Gdx.files.internal("gamefont.png"), false);
    }

    @Override
    public void render() {

        // Render
        batch.begin();
        backgroundManagement.render();
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }

}