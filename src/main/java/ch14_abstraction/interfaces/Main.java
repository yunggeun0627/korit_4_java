package ch14_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController(
               new PowerButton(), new ChannelDownButton(), new ChannelUpButton(),
                new VolumeDownButton(), new VolumeUpButton()
        );
        // 별개의 PowerButton 객체를 생성해서 메서드 호춯이 가능한가?
        PowerButton powerButton = new PowerButton();

        tvRemoteController.onPressPowerButton();        // 결과값 : 전원을 켭니다.
        powerButton.onPressed();        // 가능          // 결과값 : 전원을 켭니다 -> 전원을 끕니다.
        tvRemoteController.onPressPowerButton();        // 결과값 : 전원을 끕니다
        tvRemoteController.onPressChannelDownButton();
        tvRemoteController.onDownPressChannelDownButton();
        tvRemoteController.onPressChannelUpButton();
        tvRemoteController.onUpChannelUpButton();

//        VolumeDownButton volumeDownButton = new VolumeDownButton();
        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeDownButton();
        tvRemoteController.onPressedVolumeUpButton();
        tvRemoteController.onUpVolumeUpButton();
    }
}
