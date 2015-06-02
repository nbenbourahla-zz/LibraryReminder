package android.nazim.app.libraryreminder.adapter;

import android.nazim.app.libraryreminder.R;
import android.nazim.app.libraryreminder.ViewHolder.ModelViewHolder;
import android.nazim.app.libraryreminder.model.Book;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Nazim on 01/06/15.
 */
public class BookAdapter extends AbstractAdapter  {

    public BookAdapter(List<Book> contactList) {
        super(contactList);
    }

    @Override
    public void onBindViewHolder(ModelViewHolder tvShowHolder, int i) {
        Book ci = ((Book) contactList.get(i));
        tvShowHolder.getInfo1().setText("Page : " + ci.page);
        tvShowHolder.getName().setText(ci.name + "");
        tvShowHolder.getInfo2().setVisibility(View.GONE);
    }
}
