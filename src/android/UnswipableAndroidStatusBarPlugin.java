package ngocdaothanh.cordova.plugins;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;

public class UnswipableAndroidStatusBarPlugin extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        if (action.equals("prevent")) {
            CustomViewGroup.add(this.cordova.getActivity());
            callbackContext.success();
            return true;
        }
        return false;
    }
}
