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

import com.activeandroid.query.Select;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nazim on 29/05/15.
 */
public class TvShowFragmentList extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;

    private List<TvShow> mContentItems = new ArrayList<>();

    public static TvShowFragmentList newInstance() {
        return new TvShowFragmentList();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tv_show, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(true);


        for (int i = 0; i < 20; ++i) {
            TvShow show = new TvShow();
            show.episode = i + 1;
            show.season = 1;
            show.name = "Serie N°" + (i + 1);
            mContentItems.add(show);
        }
        //mContentItems.addAll(getAll());

        mAdapter = new TvShowAdapter(mContentItems);
        mRecyclerView.setAdapter(mAdapter);

        //MaterialViewPagerHelper.registerRecyclerView(getActivity(), mRecyclerView, null);

        view.findViewById(R.id.pink_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), AddTvShowActivity.class);
                startActivity(i);
            }
        });
    }

    public static List<TvShow> getAll() {
        return new Select()
                .from(TvShow.class)
                .orderBy("Name ASC")
                .execute();
    }
}
