package android.nazim.app.libraryreminder;

import android.nazim.app.libraryreminder.ViewHolder.TvShowViewHolder;
import android.nazim.app.libraryreminder.model.TvShow;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by nazim on 29/05/15.
 */
public class TestRecyclerViewAdapter extends RecyclerView.Adapter<TvShowViewHolder> {

    List<TvShow> contents;

    static final int TYPE_HEADER = 0;
    static final int TYPE_CELL = 1;

    public TestRecyclerViewAdapter(List<TvShow> contents) {
        this.contents = contents;
    }

    @Override
    public int getItemViewType(int position) {
        switch (position) {
            case 0:
                return TYPE_HEADER;
            default:
                return TYPE_CELL;
        }
    }

    @Override
    public int getItemCount() {
        return contents.size();
    }

    @Override
    public TvShowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;

        switch (viewType) {
            case TYPE_HEADER: {
                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.list_item_card_big, parent, false);
                return new TvShowViewHolder(view) {
                };
            }
            case TYPE_CELL: {
                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.list_item_card_small, parent, false);
                return new TvShowViewHolder(view) {
                };
            }
        }
        return null;
    }


    @Override
    public void onBindViewHolder(TvShowViewHolder holder, int position) {
        switch (getItemViewType(position)) {
            case TYPE_HEADER:
                holder.getName().setText(contents.get(position).name);
                holder.getSeason().setText(contents.get(position).season + "");
                holder.getEpisode().setText(contents.get(position).episode + "");
                break;
            case TYPE_CELL:
                holder.getName().setText(contents.get(position).name);
                holder.getSeason().setText(contents.get(position).season + "");
                holder.getEpisode().setText(contents.get(position).episode + "");
                break;
        }
    }
}