import metadata.QuestionClosingRemark;
import metadata.QuestionStatus;

import java.util.Date;
import java.util.List;

public class Question implements Search {
    private String title, description;
    private int viewCount, voteCount;
    private Date creationTime, updateTime;
    private QuestionStatus status;
    private QuestionClosingRemark closingRemark;

    private Member askingMember;
    private Bounty bounty;
    private List<Photo> photos;
    private List<Comment> comments;
    private List<Answer> answers;

    public boolean close();
    public boolean undelete();
    public boolean addComment(Comment comment);
    public boolean addBounty(Bounty bounty);

    public static List<Question> search(String query) {
        // return all questions containing the string query in their title or description.
        return null;
    }
}