import java.util.List;

/*
 Social Media Connections
 Social media connections can serve as a means of recognizing relationships among a group of people.
 These relationships can be represented as an undirected graph where edges join related people.
 A group of n social media friends is uniquely numbered from 1 to friend_nodes.
 The group of friends is expressed as a graph with friend_edges undirected edges,
 where each pair of best_friends is directly connected by an edge.
 A trio is defined as a group of three best friends.
 The friendship score for a person in a trio is defined as the number of best friends
 that person has outside of the trio. The friendship sum for a trio is the sum of trio's friendship scores.

 Given friendship connection data, create an undirected graph and determine
 the minimum friendship sum for all trios of best friends in the group.
 If no such trio exists, return -1

 Example Input -
 friend_nodes = 6
 friend_edges = 6
 friends_from = [1, 2, 2, 3, 4, 5]
 friends_to = [2, 4, 5, 5, 5, 6]

 Example Output - 3

 Explanation -
 If cycle is present, count the no of vertices that are not part of the cycle and
 connected to any of the vertices of the cycle
 Trio formed is among {2, 4, 5}
 Friends of 2 other than 4,5 are {1} => total count = 1
 Friends of 4 other than 2,5 are {} => total count = 0
 Friends of 5 other than 2,4 are {3, 6} => total count = 2
 Sum of total count = 3
 */
public class SocialMediaConnection {
    public static int bestTrio(int friendsNodes, List<Integer> friendsFrom, List<Integer> friendsTo) {
        return -1;
    }
}
