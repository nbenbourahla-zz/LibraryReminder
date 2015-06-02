package android.nazim.app.libraryreminder.ViewHolder;

import android.nazim.app.libraryreminder.R;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nazim on 29/05/15.
 */
public class ModelViewHolder extends RecyclerView.ViewHolder {

    protected TextView name;
    protected TextView info1;
    protected TextView info2;

    public ModelViewHolder(View v) {
        super(v);
        name = (TextView) v.findViewById(R.id.name);
        info1 = (TextView) v.findViewById(R.id.info1);
        info2 = (TextView) v.findViewById(R.id.info2);
    }

    public TextView getName() {
        return name;
    }

    public TextView getInfo1() {
        return info1;
    }

    public TextView getInfo2() {
        return info2;
    }
}
