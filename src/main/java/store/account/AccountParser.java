package store.account;

public class AccountParser {

    public static Account to(AccountIn in) {
        return in == null ? null :
            Account.builder()
                .name(in.name())
                .email(in.email())
                .password(in.password())
                .build();
    }

    public static AccountOut to(Account p) {
        return p == null ? null :
            AccountOut.builder()
                .id(p.id())
                .name(p.name())
                .email(p.email())
                .build();
    }
    
}