package ch14_abstraction.interfaces;

public class TvRemoteController {
    // field 선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController(
            PowerButton powerButton,
            ChannelDownButton channelDownButton,
            ChannelUpButton channelUpButton,
            VolumeDownButton volumeDownButton,
            VolumeUpButton volumeUpButton
    ) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    //field들을 이용한 메서드들을 정의
    public void onPressPowerButton() {
        System.out.print("Tv의");
        powerButton.onPressed();
    }

    public void onPressChannelDownButton() {
        System.out.print("Tv의");
        channelDownButton.onPressed();
    }

    public void onDownPressChannelDownButton() {
        System.out.print("Tv의");
        channelUpButton.onDown();
    }

    // onPressChannelUpButton() 메서드와 onUpChannelUpButton() 메서드를 구현
    // Main에서 둘다 호출
    public void onPressChannelUpButton() {
        System.out.print("Tv의");
        channelUpButton.onPressed();
    }
    public void onUpChannelUpButton() {
        System.out.println("TV의");
        System.out.println(channelUpButton.onUp());
    }
    public void onPressedVolumeDownButton() {
        System.out.print("Tv의 ");
        volumeDownButton.onPressed();
    }
    public void onDownVolumeDownButton() {
        System.out.print("Tv의 ");
        volumeDownButton.onDown();
    }

    public void onPressedVolumeUpButton() {
        System.out.print("Tv의 ");
        volumeUpButton.onPressed();
    }
    public void onUpVolumeUpButton() {
        System.out.print("Tv의 ");
        System.out.println(volumeUpButton.onUp());
    }
}
