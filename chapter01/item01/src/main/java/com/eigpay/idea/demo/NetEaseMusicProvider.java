package com.eigpay.idea.demo;

/**
 * @author LCN
 * @date 2018-02-20 下午 08:48
 * description:
 */
public class NetEaseMusicProvider implements MusicProvider {

    @Override
    public MusicApp getMusicApp() {
        boolean isDeviceAndroid = true;
        if ( isDeviceAndroid ) {
            return new NetEaseMusicApp();
        }
        System.out.println("无播放器");
        return null;
    }

}
