/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.mobileperf.render;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android.mobileperf.render.databinding.ActivityMainBinding;

/**
 * The main activity for the part of the course dealing with rendering performance. Works
 * simply as a table of contents: surfaces buttons that launch the ChatumLatinum and DroidCards
 * activities.
 */
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        addButton(getString(R.string.title_activity_chatum_latinum), binding.activityMainContainer);
    }

    private void addButton(String description, ViewGroup parent) {
        Button button = new Button(this);
        button.setOnClickListener(v -> {
            Intent problemIntent = new Intent(MainActivity.this, ChatumLatinumActivity.class);
            startActivity(problemIntent);
        });
        button.setText(description);
        parent.addView(button);
    }
}