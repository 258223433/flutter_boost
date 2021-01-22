package com.idlefish.flutterboost;

import android.app.Activity;

import com.idlefish.flutterboost.containers.FlutterViewContainer;

/**
 * android 测 boost操作路由提供的接口
 */
public class BoostNavigator {
    /**
     * Native 打开flutter 页面的接口
     *  1.先通知flutter测，打开一个flutter 页面
     *  2.dart测通知Native 打开一个容器
     *  场景：Naitve 页面跳转到flutter 页面
     * @param pageName
     * @param arguments
     */
//    public static void pushRoute(String pageName, HashMap<String, String> arguments) {
//        FlutterBoost.instance().getPlugin().pushRoute(pageName, arguments, null);
//    }


    /**
     * 根据uniqueId 关闭 flutter页面，如果有容器，则关闭容器.
     * uniqueId 可以为null，为null 时候，回退最上层的页面。
     *  @param uniqueId
     */
//    public static void popRoute(String uniqueId) {
//        FlutterBoost.instance().getPlugin().popRoute(uniqueId, null);
//        FlutterViewContainer container=FlutterBoost.instance().getContainerManager().findContainerById(uniqueId);
//        if(container!=null){
//            container.finishContainer(null);
//        }
//    }

    /**
     * 根据unqueid，返回容器
     * 兼容老版本
     * @param uniqueId
     * @return
     */
    public static FlutterViewContainer findFlutterViewContainerById(String uniqueId) {
        return FlutterBoost.instance().getPlugin().findContainerById(uniqueId);
    }

    /**
     * 根据unqueid，返回容器
     * 兼容老版本
     * @return
     */
    public static FlutterViewContainer getTopFlutterViewContainer() {
        return FlutterBoost.instance().getPlugin().getTopContainer();
    }

    /**
     * 提供给业务 最上层的activity。
     * @return
     */
    public static Activity getTopActivity() {
        return FlutterBoost.instance().getTopActivity();
    }

}