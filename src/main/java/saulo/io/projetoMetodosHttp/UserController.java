package saulo.io.projetoMetodosHttp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping(value = "user/{name}", method = RequestMethod.GET)
	public List<UserEntity> getUser(@PathVariable String name) {

		List<UserEntity> userList = new ArrayList<>();

		UserEntity userController = new UserEntity("Saulo", "saulo@gmail");

		UserEntity userController2 = new UserEntity(name, "jose@gmail");

		userList.add(userController);
		userList.add(userController2);

		return userList;

	}

	@RequestMapping(value = "user", method = RequestMethod.POST)
	public UserEntity setUserEntity(@RequestBody UserEntity userEntity) {
		return userEntity;
	}
}
