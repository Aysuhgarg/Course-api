package io.ayush.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
//	private List<Topic> topics= new ArrayList<>(Arrays.asList(
//			new Topic("spring","Spring Framework","Spring Framework Description"),
//			new Topic("javascript","JAVASCRIPT","JavaScript Description"),
//			new Topic("java","Core java","Core java Description")
//			));
	
	public List<Topic> getAllTopics()
	{
		//return topics;
		List<Topic> topics=new ArrayList();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	
	public Object getTopic(String id)
	{
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findById(id);
	}
	public void addTopic(Topic topic)
	{
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
		
//		for(int i=0;i<topics.size();i++)
//		{
//			Topic t=topics.get(i);
//			if(t.getId().equals(id)) {
//				topics.set(i,topic);
//				return;
//			}
//		}
		
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
		//topics.removeIf(t-> t.getId().equals(id));
	}
}
