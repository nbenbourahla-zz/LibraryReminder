package android.nazim.app.libraryreminder.fragment;

import android.content.Intent;
import android.nazim.app.libraryreminder.activity.AddTvShowActivity;
import android.nazim.app.libraryreminder.adapter.BookAdapter;
import android.nazim.app.libraryreminder.adapter.TvShowAdapter;
import android.nazim.app.libraryreminder.model.Book;
import android.nazim.app.libraryreminder.model.TvShow;

import com.activeandroid.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nazim on 29/05/15.
 */
public class BookFragmentList extends AbstractViewPagerFragment {

    public static BookFragmentList newInstance() {
        return new BookFragmentList();
    }

    @Override
    public void initAdapter() {
        ArrayList<Book> dataList = new ArrayList<>();
        for (Book show : (List<Book>) getAll()) {
            dataList.add(show);
        }
        mAdapter = new BookAdapter(dataList);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void goToAddActivity() {
        Intent i = new Intent(getActivity(), AddTvShowActivity.class);
        startActivity(i);
    }

    @Override
    public List<? extends Model> getAll() {
        List<Book> contents = new ArrayList<>();
        for (int i = 0; i < 20; ++i) {
            Book book = new Book();
            book.page = 15;
            book.name = "Livre N°" + (i + 1);
            contents.add(book);
        }
        return contents;
    }
}
