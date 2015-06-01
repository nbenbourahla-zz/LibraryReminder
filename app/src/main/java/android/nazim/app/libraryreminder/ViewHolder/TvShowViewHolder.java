package android.nazim.app.libraryreminder.ViewHolder;

import android.nazim.app.libraryreminder.R;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nazim on 29/05/15.
 */
public class TvShowViewHolder extends RecyclerView.ViewHolder {

    protected TextView name;
    protected TextView season;
    protected TextView episode;

    public TvShowViewHolder(View v) {
        super(v);
        name = (TextView) v.findViewById(R.id.txtName);
        season = (TextView) v.findViewById(R.id.txtSurname);
        episode = (TextView) v.findViewById(R.id.txtEmail);
    }

    public TextView getName() {
        return name;
    }

    public TextView getSeason() {
        return season;
    }

    public TextView getEpisode() {
        return episode;
    }
}
