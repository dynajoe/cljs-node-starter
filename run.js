try {
    require("source-map-support").install();
} catch(err) {
}
require("./out/goog/bootstrap/nodejs.js");
require("./out/smoker_cljs.js");
goog.require("smoker_cljs.core");
goog.require("cljs.nodejscli");
