package DayFive;
import java.util.*;

public class VotedPeopleList {

	static Set<String> set;
	
	public void addVotedName(String name)
	{
		
		 boolean isResult = set.add(name);
		 
		 checkIsResult(isResult,name);
		
	}
	
	private void checkIsResult(boolean isResult,String name) {
		
		
		if(!isResult)
		{
			System.out.println("mr : "+name +" According to govt rule u cannot voted multiple times,thats is against a law");
		
		}
		else
		{
			System.out.println("done,you did a great job Mr:"+name);
		}
	}

	void isHeVoted(String name)
	{
		
		if(set.contains(name))
		{
			
			System.out.println("yeh,your vote has counted :"+name);
		}else {
			
			System.out.println("Sorry you still not voted yet");
		}
		
	}
	
	void totalCountOfVote()
	{
		
		System.out.println(set.size());
	}
	public static void main(String[] args) {
		
		
		VotedPeopleList vote = new VotedPeopleList();
		vote.set = new HashSet<>();
		
		vote.addVotedName("yusuf");
		vote.addVotedName("khaja");
		vote.addVotedName("yusuf");
		vote.isHeVoted("yusuf");
		vote.totalCountOfVote();
		
	}
}
