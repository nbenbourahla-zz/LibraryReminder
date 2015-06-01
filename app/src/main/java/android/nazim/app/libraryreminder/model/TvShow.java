package android.nazim.app.libraryreminder.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by nazim on 29/05/15.
 */
@Table(name = "TvShows")
public class TvShow extends Model {

    @Column(name = "Name", notNull = true)
    public String name;

    @Column(name = "Season")
    public int season;

    @Column(name = "Episode")
    public int episode;

    public TvShow() {
        super();
    }

    public TvShow(String name, int season, int episode) {
        super();
        this.name = name;
        this.season = season;
        this.episode = episode;
    }

}
