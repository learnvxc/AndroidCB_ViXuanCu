package com.example.animal_sound;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Ẩn ActionBar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        // Thiết lập giao diện
        setContentView(R.layout.activity_main);

        // Ánh xạ các view
        ImageView animalIcon = findViewById(R.id.animalIcon);
        TextView animalSoundText = findViewById(R.id.animalSoundText);

        // Thiết lập nội dung cho các view nếu cần (ví dụ nếu lấy từ tài nguyên khác)
        animalSoundText.setText("Animal sound");
        animalIcon.setImageResource(R.drawable.ic_animal_icon);  // Đảm bảo bạn đã thêm ảnh vào drawable
    }
}