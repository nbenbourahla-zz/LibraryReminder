package android.nazim.app.libraryreminder.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by nazim on 29/05/15.
 */
@Table(name = "Movies")
public class Movie extends Model {

    @Column(name = "Name", notNull = true)
    public String name;


    public Movie() {
        super();
    }

    public Movie(String name) {
        super();
        this.name = name;
    }

}
