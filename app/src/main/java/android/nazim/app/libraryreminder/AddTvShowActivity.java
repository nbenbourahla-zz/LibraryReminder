package android.nazim.app.libraryreminder;

import android.nazim.app.libraryreminder.model.TvShow;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class AddTvShowActivity extends ActionBarActivity {

    private EditText tvShowName;
    private EditText tvShowSeason;
    private EditText tvShowEpisode;
    private Button tvShowSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_tv_show);

        Toolbar toolbar =   (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowTitleEnabled(true);
        }

        tvShowName = (EditText) findViewById(R.id.tv_show_name);
        tvShowSeason = (EditText) findViewById(R.id.tv_show_season);
        tvShowEpisode = (EditText) findViewById(R.id.tv_show_episode);
        tvShowSave = (Button) findViewById(R.id.tv_show_save);
        tvShowSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = tvShowName.getText().toString();
                int season = Integer.parseInt(tvShowSeason.getText().toString());
                int episode = Integer.parseInt(tvShowEpisode.getText().toString());
                TvShow tvShow = new TvShow(name, season, episode);
                tvShow.save();
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_tv_show, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
