package com.example.Library.Management.System.Service;

import com.example.Library.Management.System.Enums.CardStatus;
import com.example.Library.Management.System.Models.Card;
import com.example.Library.Management.System.Models.Student;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    public Card createCard(Student student){

        Card newCard=new Card();
        newCard.setCardStatus(CardStatus.ACTIVATED);
        newCard.setStudent(student);
        return newCard;
    }
}
