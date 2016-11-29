package jromero82.mygame;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by joelr on 29-Nov-16.
 */

public class GameView extends GLSurfaceView {

    private final GameRenderer gameRenderer;

    public GameView(Context context) {
        super(context);

        setEGLContextClientVersion(2);

        gameRenderer = new GameRenderer(context);

        setRenderer(gameRenderer);
    }
}
