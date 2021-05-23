package io.ayush.springboot.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

	//Topic findOne(String id);

	//getAllTopic()
	//getTopic(String id)
	//updateTopic(Topic t)
	//deleteTopic(String id)
	
}
