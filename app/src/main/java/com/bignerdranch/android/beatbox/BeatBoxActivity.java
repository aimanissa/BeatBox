package com.bignerdranch.android.beatbox;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

public class BeatBoxActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}