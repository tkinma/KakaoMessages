package bookmarket;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface KakaoMessagesRepository extends CrudRepository<KakaoMessages, Long> {


}