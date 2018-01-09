package com.lagami_desktop.animefinder;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.flaviofaria.kenburnsview.KenBurnsView;
import com.squareup.picasso.Picasso;

/**
 * Created by Lagami-Desktop on 2017-04-29.
 */

public class DetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        Bundle bundle = getIntent().getExtras();

        KenBurnsView kbv = (KenBurnsView) findViewById(R.id.cover_img);
        TextView title = (TextView) findViewById(R.id.tv_title);
        TextView synopsis = (TextView) findViewById(R.id.tv_synopsis);
        TextView subtitle = (TextView) findViewById(R.id.tv_subtitle);
        TextView others = (TextView) findViewById(R.id.tv_others);
        String banneruri = bundle.getString("banner_uri");
        if(banneruri == null || banneruri.equals("null")){
            Picasso.with(this).load(Uri.parse(bundle.getString("cover_uri"))).into(kbv);
        }
        else{
            Picasso.with(this).load(Uri.parse(banneruri)).into(kbv);
        }
        title.setText(bundle.getString("title"));
        String synop = bundle.getString("synopsis");
        synop = synop.replaceAll("<(/)?([a-zA-Z]*)(\\s[a-zA-Z]*=[^>]*)?(\\s)*(/)?>", "");
        synop = synop.replaceAll("&amp;", "&");
        synop = synop.replaceAll("&quot;", "\"");
        synopsis.setText(synop);
        subtitle.setText(bundle.getString("subtitle"));
        String source = bundle.getString("source");
        if(source == null || source.equals("null")){
            others.setText("(No Source Information), AvgScore : " + bundle.getString("avgscore"));
        }
        else{
            others.setText("Source : " + source + ", AvgScore : " + bundle.getString("avgscore"));
        }

    }
}
