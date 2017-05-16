var exec = require('cordova/exec');

function UnswipableAndroidStatusBarPlugin() {
}

UnswipableAndroidStatusBarPlugin.prototype.prevent = function () {
  exec(
    function(res) {},
    function (err) {},
    'UnswipableAndroidStatusBarPlugin', 'prevent', []
  );
}

module.exports = new UnswipableAndroidStatusBarPlugin();
