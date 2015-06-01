package android.nazim.app.libraryreminder.adapter;

import android.nazim.app.libraryreminder.R;
import android.nazim.app.libraryreminder.ViewHolder.TvShowViewHolder;
import android.nazim.app.libraryreminder.model.TvShow;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Nazim on 01/06/15.
 */
public class TvShowAdapter extends RecyclerView.Adapter<TvShowViewHolder> {

    private List<TvShow> contactList;

    public TvShowAdapter(List<TvShow> contactList) {
        this.contactList = contactList;
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    @Override
    public void onBindViewHolder(TvShowViewHolder tvShowHolder, int i) {
        TvShow ci = contactList.get(i);
        tvShowHolder.getEpisode().setText(ci.episode + "");
        tvShowHolder.getName().setText(ci.name + "");
        tvShowHolder.getSeason().setText(ci.season + "");
    }

    @Override
    public TvShowViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.list_item_card_small, viewGroup, false);

        return new TvShowViewHolder(itemView);
    }
}
