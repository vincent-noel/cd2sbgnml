package fr.curie.cd2sbgnml.model;

import fr.curie.cd2sbgnml.xmlcdwrappers.ReactionWrapper;

public class ReactionModelFactory {
    public static GenericReactionModel create(ReactionWrapper reactionWrapper) {
        if(reactionWrapper.getReactionType().equals("HETERODIMER_ASSOCIATION")) {
            return new AssociationReactionModel(reactionWrapper);
        }
        else if(reactionWrapper.getReactionType().equals("DISSOCIATION")) {
            return new DissociationReactionModel(reactionWrapper);
        }
        else if(reactionWrapper.getReactionType().equals("TRUNCATION")) {
            return new DissociationReactionModel(reactionWrapper);
        }
        else {
            return new SimpleReactionModel(reactionWrapper);
        }

    }
}