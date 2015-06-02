package android.nazim.app.libraryreminder.adapter;

import android.nazim.app.libraryreminder.R;
import android.nazim.app.libraryreminder.ViewHolder.ModelViewHolder;
import android.nazim.app.libraryreminder.model.TvShow;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.activeandroid.Model;

import java.util.List;

/**
 * Created by Nazim on 01/06/15.
 */
public abstract class AbstractAdapter extends RecyclerView.Adapter<ModelViewHolder> {

    protected List<? extends Model> contactList;

    public AbstractAdapter(List<? extends Model> contactList) {
        this.contactList = contactList;
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    @Override
    public abstract void onBindViewHolder(ModelViewHolder tvShowHolder, int i);
    /*{
        TvShow ci = contactList.get(i);
        tvShowHolder.getInfo1().setText("Episode : " + ci.episode);
        tvShowHolder.getName().setText(ci.name + "");
        tvShowHolder.getInfo2().setText("Saison : " + ci.season);
    }*/

    @Override
    public ModelViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.list_item_card_small, viewGroup, false);

        return new ModelViewHolder(itemView);
    }
}
