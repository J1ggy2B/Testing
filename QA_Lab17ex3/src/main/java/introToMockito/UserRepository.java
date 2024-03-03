package introToMockito;

public interface UserRepository {

	public boolean exists(String trimmedUsername);

	public User register(User user);

	public User login(User user);

}