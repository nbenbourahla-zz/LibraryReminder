package android.nazim.app.libraryreminder.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by nazim on 29/05/15.
 */
@Table(name = "Books")
public class Book extends Model {

    @Column(name = "Name", notNull = true)
    public String name;

    @Column(name = "Page")
    public int page;

    public Book() {
        super();
    }

    public Book(String name, int page) {
        super();
        this.name = name;
        this.page = page;
    }

}
