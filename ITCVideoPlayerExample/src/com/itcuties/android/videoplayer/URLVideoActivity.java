package com.itcuties.android.videoplayer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.VideoView;

/**
 * Play Video from URL
 * 
 * @see ITCuties
 */
public class URLVideoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.url_activity_video);

		VideoView video = (VideoView)findViewById(R.id.videoView);
		video.setVideoPath("http://download.itcuties.com/teaser/itcuties-teaser-480.mp4");
		video.start();

	}

}
