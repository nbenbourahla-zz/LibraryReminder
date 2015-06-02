package android.nazim.app.libraryreminder.adapter;

import android.nazim.app.libraryreminder.R;
import android.nazim.app.libraryreminder.ViewHolder.ModelViewHolder;
import android.nazim.app.libraryreminder.model.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Nazim on 01/06/15.
 */
public class MovieAdapter extends AbstractAdapter  {

    public MovieAdapter(List<Movie> contactList) {
        super(contactList);
    }

    @Override
    public void onBindViewHolder(ModelViewHolder tvShowHolder, int i) {
        Movie ci = ((Movie) contactList.get(i));
        tvShowHolder.getInfo1().setVisibility(View.GONE);
        tvShowHolder.getName().setText(ci.name + "");
        tvShowHolder.getInfo2().setVisibility(View.GONE);
    }
}
