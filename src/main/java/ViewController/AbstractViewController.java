package ViewController;

import Model.AbstractModel;
import javafx.scene.Parent;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;
import java.util.ArrayList;

public abstract class AbstractViewController implements PropertyChangeListener {
    private ArrayList<AbstractModel> registeredModels;
    private ArrayList<Parent> registeredViews;

    public AbstractViewController() {
        registeredModels = new ArrayList<>();
        registeredViews = new ArrayList<>();
    }

    public void addModel(AbstractModel model) {
        registeredModels.add(model);
        model.addPropertyChangeListener(this);
    }

    public void removeModel(AbstractModel model) {
        registeredModels.remove(model);
        model.removePropertyChangeListener(this);
    }

    public void addView(Parent view) {
        registeredViews.add(view);
    }

    public void removeView(Parent view) {
        registeredViews.remove(view);
    }

    public abstract void propertyChange (PropertyChangeEvent evt);

    protected  void setModelProperty(String propertyName, Object newValue) {
        for (AbstractModel model : registeredModels) {
            try {
                Method method = model.getClass().getMethod("set"+propertyName, new Class[] {newValue.getClass()});
                method.invoke(model, newValue);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
