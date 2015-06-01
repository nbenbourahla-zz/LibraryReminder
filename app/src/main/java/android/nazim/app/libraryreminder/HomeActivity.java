package android.nazim.app.libraryreminder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.github.florent37.materialviewpager.MaterialViewPager;

public class HomeActivity extends ActionBarActivity {

    private TabLayout tabLayout;

    private DrawerLayout mDrawer;
    private ViewPager mViewPager;
    private ActionBarDrawerToggle mDrawerToggle;
    private Toolbar toolbar;
    private View headerLogo;
    private ImageView headerLogoContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setTitle("");

        headerLogo = findViewById(R.id.headerLogo);
        headerLogoContent = (ImageView) findViewById(R.id.headerLogoContent);

        mViewPager = (ViewPager) findViewById(R.id.viewpager);

        toolbar =   (Toolbar) findViewById(R.id.toolbar);

        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        if (toolbar != null) {
            setSupportActionBar(toolbar);

            final ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.setDisplayHomeAsUpEnabled(true);
                actionBar.setDisplayShowHomeEnabled(true);
                actionBar.setDisplayShowTitleEnabled(true);
                actionBar.setDisplayUseLogoEnabled(false);
                actionBar.setHomeButtonEnabled(true);
            }
        }

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawer, 0, 0);
        mDrawer.setDrawerListener(mDrawerToggle);


        mViewPager.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {

            int oldPosition = -1;

            @Override
            public Fragment getItem(int position) {
                //switch (position) {
                //case 0:
                //    return RecyclerViewFragment.newInstance();
//                    case 1:
                return TvShowFragmentList.newInstance();
                //case 2:
                //    return WebViewFragment.newInstance();
                //                  default:
                //                    return ScrollFragment.newInstance();
                //}
            }

            @Override
            public void setPrimaryItem(ViewGroup container, int position, Object object) {
                super.setPrimaryItem(container, position, object);

                //only if position changed
                if (position == oldPosition)
                    return;
                oldPosition = position;

                int color = 0;
                Drawable drawable = null;
                switch (position) {
                    case 0:
                        drawable = getResources().getDrawable(R.drawable.tv_show);
                        color = getResources().getColor(R.color.blue);
                        break;
                    case 1:
                        drawable = getResources().getDrawable(R.drawable.movie);
                        color = getResources().getColor(R.color.green);
                        break;
                    case 2:
                        drawable = getResources().getDrawable(R.drawable.book);
                        color = getResources().getColor(R.color.cyan);
                        break;
                }

                final int fadeDuration = 400;
                //toggleLogo(drawable, color, fadeDuration);
                //mViewPager.setColor(color, fadeDuration);
            }

            @Override
            public int getCount() {
                return 3;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                switch (position) {
                    case 0:
                        return "Series";
                    case 1:
                        return "Films";
                    case 2:
                        return "Livre";
                }
                return "";
            }
        });
        //mViewPager.getViewPager().setOffscreenPageLimit(mViewPager.getViewPager().getAdapter().getCount());
        //mViewPager.setViewPager(mViewPager.getViewPager());

        mViewPager.setCurrentItem(0);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
//indique au tablayout quel est le viewpager à écouter
        tabLayout.setupWithViewPager(mViewPager);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}