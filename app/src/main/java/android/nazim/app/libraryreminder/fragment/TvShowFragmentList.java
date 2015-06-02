package android.nazim.app.libraryreminder.fragment;

import android.content.Intent;
import android.nazim.app.libraryreminder.R;
import android.nazim.app.libraryreminder.activity.AddTvShowActivity;
import android.nazim.app.libraryreminder.adapter.TvShowAdapter;
import android.nazim.app.libraryreminder.model.TvShow;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.activeandroid.Model;
import com.activeandroid.query.Select;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nazim on 29/05/15.
 */
public class TvShowFragmentList extends AbstractViewPagerFragment {


    public static TvShowFragmentList newInstance() {
        return new TvShowFragmentList();
    }

    @Override
    public void initAdapter() {
        ArrayList<TvShow> dataList = new ArrayList<>();
        for (TvShow show : (List<TvShow>) getAll()) {
            dataList.add(show);
        }
        mAdapter = new TvShowAdapter(dataList);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void goToAddActivity() {
        Intent i = new Intent(getActivity(), AddTvShowActivity.class);
        startActivity(i);
    }

    @Override
    public List<? extends Model> getAll() {
        List<TvShow> contents = new ArrayList<>();
        for (int i = 0; i < 20; ++i) {
            TvShow show = new TvShow();
            show.episode = i + 1;
            show.season = 1;
            show.name = "Serie N°" + (i + 1);
            contents.add(show);
        }
        return contents;
    }
}
