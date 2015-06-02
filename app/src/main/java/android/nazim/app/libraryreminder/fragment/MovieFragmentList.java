package android.nazim.app.libraryreminder.fragment;

import android.content.Intent;
import android.nazim.app.libraryreminder.activity.AddTvShowActivity;
import android.nazim.app.libraryreminder.adapter.BookAdapter;
import android.nazim.app.libraryreminder.adapter.MovieAdapter;
import android.nazim.app.libraryreminder.adapter.TvShowAdapter;
import android.nazim.app.libraryreminder.model.Book;
import android.nazim.app.libraryreminder.model.Movie;
import android.nazim.app.libraryreminder.model.TvShow;

import com.activeandroid.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nazim on 29/05/15.
 */
public class MovieFragmentList extends AbstractViewPagerFragment {


    public static MovieFragmentList newInstance() {
        return new MovieFragmentList();
    }

    @Override
    public void initAdapter() {
        ArrayList<Movie> dataList = new ArrayList<>();
        for (Movie show : (List<Movie>) getAll()) {
            dataList.add(show);
        }
        mAdapter = new MovieAdapter(dataList);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void goToAddActivity() {
        Intent i = new Intent(getActivity(), AddTvShowActivity.class);
        startActivity(i);
    }

    @Override
    public List<? extends Model> getAll() {
        List<Movie> contents = new ArrayList<>();
        for (int i = 0; i < 20; ++i) {
            Movie show = new Movie();
            show.name = "Film N°" + (i + 1);
            contents.add(show);
        }
        return contents;
    }
}
