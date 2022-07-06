package Manager;

import javafx.stage.Stage;

public class StateManager {
    public static StateManager stateManagerInstance;
    public static Stage primaryStage;

    public StateManager getInstance () {
        if (StateManager.stateManagerInstance != null) {
            return StateManager.stateManagerInstance;
        }
        else {
            stateManagerInstance = new StateManager();
            return stateManagerInstance;
        }
    }
}
