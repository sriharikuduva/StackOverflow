import java.util.Date;

public class Photo {
    private int photoId;
    private String photoPath;
    private Date creationDate;
    private Member creatingMember;

    public int getPhotoId() {
        return photoId;
    }
    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getPhotoPath() {
        return photoPath;
    }
    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public Date getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Member getCreatingMember() {
        return creatingMember;
    }
    public void setCreatingMember(Member creatingMember) {
        this.creatingMember = creatingMember;
    }

    public boolean delete();
}