import java.util.List;

public class Member {
    private Account account;
    private List<Badge> badges;


    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Badge> getBadges() {
        return badges;
    }
    public void setBadges(List<Badge> badges) {
        this.badges = badges;
    }

    public int getReputation() { return account.getReputation(); }
    public String getEmail() { return account.getEmail(); }
    public boolean createQuestion(Question question);
    public boolean createTag(Tag tag);;
}