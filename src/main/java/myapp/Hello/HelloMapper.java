package myapp.Hello;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HelloMapper {

	//	@Autowired
	//	private JdbcTemplate jdbcTemplate;

	//	public Map<String, Object> findById(String id);
	//	{
	//
	//		//SELECT文
	//		String query = "SELECT * "
	//				+ "FROM employee "
	//				+ "WHERE id=? ";
	//
	//		//検索実行
	//		Map<String, Object> employee = jdbcTemplate.queryForMap(query, id);
	//
	//		return employee;
	//	}

	public Map<String, Object> findById(String id);

}
