package constrcut;

public class ConstructMain2 {
    public static void main(String[] args) {

        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user1", 16);

        MemberConstruct[] members = new MemberConstruct[]{member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("유저: " + member.name + ", 나이:  "+ member.age +", 성적: "+ member.grade);
        }
    }
}
