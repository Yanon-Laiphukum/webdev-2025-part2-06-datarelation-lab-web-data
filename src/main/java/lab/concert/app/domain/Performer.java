package lab.concert.app.domain;

import javax.persistence.*;

@Entity
public class Performer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // uses AUTO_INCREMENT in schema.sql
    private Long id;

    private String name;

    // This should map to your DB column for image. If schema.sql uses "image_uri", this is fine.
    // If schema.sql uses a different name (like "image_file"), we must use @Column(name = "image_file")
    private String imageUri;

    public Performer() { }

    public Performer(Long id, String name, String imageUri) {
        this.id = id;
        this.name = name;
        this.imageUri = imageUri;
    }

    public Performer(String name, String imageUri) {
        this(null, name, imageUri);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }
}
