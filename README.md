# CSC120-FinalProject

## Deliverables:
 - Your final codebase
 - Your revised annotated architecture diagram
 - Design justification (including a brief discussion of at least one alternative you considered)
 - A map of your game's layout (if applicable)
 - `cheatsheet.md`
 - Completed `rubric.md`

## Reflection

This game taught us about the impact that user interaction has on game making. In our old python game, user interaction wasnt a huge priority since it was only a multiple choice game that didn't require us to think about the possible paths a user can take; it was very black and white. On the other hand, this project is more complex since we have to think about every possible action a user might want to utilize inside an escape room. And we also have to think about how the titles of our action methods impact the game play. We got more experience dealing with classes that interact with one another. We struggled with figuring out how the classes interact with one another because we had to alter attributes from one class to another. We also had to think more about the types of relationships and associations between classes. 

 ## Design Justification

We had initially planned to create an escape room that was only one path with three different storylines that didnt include any special items. It would have been less interactive and been too focused on the variety of storylines rather than the variety of physical trajectories. This plan would have included several character objects and less furniture and room classes. We decided to focus on having more possible pathways rather than having different storylines because that way we can ensure we have backtracing and restricted access to rooms. Also since having three different characters would not make an impact on the course of the game but rather substitute the same path with a different name.

  
## Additional Reflection Questions

 - What was your **overall approach** to tackling this project?
    Our overall approach was thinking about how classes interact with eachother, trying to visualize how a video game character would move within our game, and trying to think about the user experience. We were also focused on the "has-a" relationship aspect since most, if not all of our objects contain this.

 - What **new thing(s)** did you learn / figure out in completing this project?
    We learned how to make seemingly unrelated classes interact with eachoter. We also learned how to use a scanner properly given that we don't need multiple but rather one and can use it in all classes by having it inputted as an attribute. 

 - Is there anything that you wish you had **implemented differently**?
    I wish we had more time to venture out and experiment with sound when the player is doing bad to help them learn how to follow the game "properly". It would also be nice to have had time to implement graphics to help visualize the layout of the rooms.  

 - If you had **unlimited time**, what additional features would you implement?
    If we have unlimited time, we would have loved to implement graphics and sound to make the game more engaging. It would also have been nice to implement different ways of exiting a room rather than having them just enter a code whether that was having different modes of exits or being in a speciifc location of a room to exit.

 - What was the most helpful **piece of feedback** you received while working on your project? Who gave it to you?
    A girl in our class who played the game on demo day made us aware of the issue with holding a letter and it helped us figure out how to manually get the users to drop the letters since the way we programmed current_letter to be a reflection of the last letter that was picked up. It was also nice to be reminded that we should figure out how to make the game less complex which we were told to do by Glenvelis given the timeframe that we had to code this.

 - If you could go back in time and give your past self some **advice** about this project, what hints would you give?
    We would advice ourselves to not stress and keep the game more simple. We would also advice ourselves to make a skeleton or even just have a rough draft pseudocode of our chatbot/main() which connects all the classes just so we can have a better understanding of which clases to complete first. We agree now that we should have had the Character class been the second class we start with because since we started with the rooms that made it hard for us to figure out how the character will be able to move objects and interact with them in general.

 - _If you worked with a team:_ please comment on how your **team dynamics** influenced your experience working on this project.
    Our group worked very well together and always have great communication skills. Us being friends outside of class helped our team dynamic because we were very vocal about our concerns about our code and ideas being overly complicated. This dynamic was also essential when we had to plan out our schedules since we were flexible with each of our timeframes and always made effort for all of us to be there and if we weren't there together someone was always filing in the other person. Our team dynamic also was great because we would always check in with one another to make sure each of us understood the code that someone else had implemented and voiced everyone's diffirent ideas to the same problem.
