package com.example.cardview_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Course_Activity extends AppCompatActivity {
    private TextView tvtitle, tvdescription, tvcategory;

    private TextView tvdescription2, tvdescription3, tvdescription4, tvdescription5, tvdescription6, tvdescription7;
//  private TextView tvdescription8, tvdescription9, tvdescription10, tvdescription11, tvdescription12, tvdescription13, tvdescription14, tvdescription15, tvdescription16

    private ImageView img, img2, img3, img4, img5, img6, img7;
//  private ImageView img8, img9, img10, img11, img12, img13, img14, img15, img16

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        tvtitle = findViewById(R.id.tvtitle);
        tvdescription = findViewById(R.id.tvdescription);
        tvdescription2 = findViewById(R.id.tvdescription2);

        tvdescription3 = findViewById(R.id.tvdescription3);
        tvdescription4 = findViewById(R.id.tvdescription4);
        tvdescription5 = findViewById(R.id.tvdescription5);
        tvdescription6 = findViewById(R.id.tvdescription6);
        tvdescription7 = findViewById(R.id.tvdescription7);
//      tvdescription8 = findViewById(R.id.tvdescription8);
//      tvdescription9 = findViewById(R.id.tvdescription9);
//      tvdescription10 = findViewById(R.id.tvdescription10);
//      tvdescription11 = findViewById(R.id.tvdescription11);
//      tvdescription12 = (TextView) findViewById(R.id.tvdescription12);
//      tvdescription13 = (TextView) findViewById(R.id.tvdescription13);
//      tvdescription14 = (TextView) findViewById(R.id.tvdescription14);
//      tvdescription15 = (TextView) findViewById(R.id.tvdescription15);
//      tvdescription16 = (TextView) findViewById(R.id.tvdescription16);

        tvcategory = findViewById(R.id.tvcategory);
        img = findViewById(R.id.coursethumbnail);
        img2 = findViewById(R.id.coursethumbnail2);

        img3 = findViewById(R.id.coursethumbnail3);
        img4 = findViewById(R.id.coursethumbnail4);
        img5 = findViewById(R.id.coursethumbnail5);
        img6 = findViewById(R.id.coursethumbnail6);
        img7 = findViewById(R.id.coursethumbnail7);
//      img8 = findViewById(R.id.coursethumbnail8);
//      img9 = findViewById(R.id.coursethumbnail9);
//      img10 = findViewById(R.id.coursethumbnail10);
//      img11 = findViewById(R.id.coursethumbnail11);
//      img12 = (ImageView) findViewById(R.id.coursethumbnail12);
//      img13 = (ImageView) findViewById(R.id.coursethumbnail13);
//      img14 = (ImageView) findViewById(R.id.coursethumbnail14);
//      img15 = (ImageView) findViewById(R.id.coursethumbnail15);
//      img16 = (ImageView) findViewById(R.id.coursethumbnail16);

        // Receive data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        String Description2 = intent.getExtras().getString("Description2");

        String Description3 = intent.getExtras().getString("Description3");
        String Description4 = intent.getExtras().getString("Description4");
        String Description5 = intent.getExtras().getString("Description5");
        String Description6 = intent.getExtras().getString("Description6");
        String Description7 = intent.getExtras().getString("Description7");
//      String Description8 = intent.getExtras().getString("Description8");
//      String Description9 = intent.getExtras().getString("Description9");
//      String Description10 = intent.getExtras().getString("Description10");
//      String Description11 = intent.getExtras().getString("Description11");
//      String Description12 = intent.getExtras().getString("Description12");
//      String Description13 = intent.getExtras().getString("Description13");
//      String Description14 = intent.getExtras().getString("Description14");
//      String Description15 = intent.getExtras().getString("Description15");
//      String Description16 = intent.getExtras().getString("Description16");

        String Category = intent.getExtras().getString("Category");
        int image = intent.getExtras().getInt("Thumbnail");
        int image2 = intent.getExtras().getInt("Thumbnail2");

        int image3 = intent.getExtras().getInt("Thumbnail3");
        int image4 = intent.getExtras().getInt("Thumbnail4");
        int image5 = intent.getExtras().getInt("Thumbnail5");
        int image6 = intent.getExtras().getInt("Thumbnail6");
        int image7 = intent.getExtras().getInt("Thumbnail7");
//      int image8 = intent.getExtras().getInt("Thumbnail8");
//      int image9 = intent.getExtras().getInt("Thumbnail9");
//      int image10 = intent.getExtras().getInt("Thumbnail10");
//      int image11 = intent.getExtras().getInt("Thumbnail11");
//      int image12 = intent.getExtras().getInt("Thumbnail12");
//      int image13 = intent.getExtras().getInt("Thumbnail13");
//      int image14 = intent.getExtras().getInt("Thumbnail14");
//      int image15 = intent.getExtras().getInt("Thumbnail15");
//      int image16 = intent.getExtras().getInt("Thumbnail16");

        // Setting values
        tvtitle.setText(Title);
        tvdescription2.setText(Description2);
        tvdescription.setText(Description);

        tvdescription3.setText(Description3);
        tvdescription4.setText(Description4);
        tvdescription5.setText(Description5);
        tvdescription6.setText(Description6);
        tvdescription7.setText(Description7);
//      tvdescription8.setText(Description8);
//      tvdescription9.setText(Description9);
//      tvdescription10.setText(Description10);
//      tvdescription11.setText(Description11);
//      tvdescription12.setText(Description12);
//      tvdescription13.setText(Description13);
//      tvdescription14.setText(Description14);
//      tvdescription15.setText(Description15);
//      tvdescription16.setText(Description16);

        tvcategory.setText(Category);
        img.setImageResource(image);
        img2.setImageResource(image2);

        img3.setImageResource(image3);
        img4.setImageResource(image4);
        img5.setImageResource(image5);
        img6.setImageResource(image6);
        img7.setImageResource(image7);
//      img8.setImageResource(image8);
//      img9.setImageResource(image9);
//      img10.setImageResource(image10);
//      img11.setImageResource(image11);
//      img12.setImageResource(image12);
//      img13.setImageResource(image13);
//      img14.setImageResource(image14);
//      img15.setImageResource(image15);
//      img16.setImageResource(image16);
    }
}