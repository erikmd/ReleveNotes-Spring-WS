package webx.relevenotes.services;

import webx.relevenotes.domain.Evaluation;
import webx.relevenotes.domain.nomenclature.AnneeScolaire;
import webx.relevenotes.domain.nomenclature.Niveau;
import webx.relevenotes.domain.nomenclature.Semestre;

import java.util.List;

/**
 * @author franck Silvestre
 */
public interface ReleveNoteService {

    /**
     * Retourne tous les évaluation correspondant à une année scolaire, un niveau
     * et un semestre
     * @param anneeScolaire  l'année scolaire
     * @param niveau  le niveau
     * @param semestre le semestre
     * @return les évaluations correspondant aux critères fournis
     */
    public List<Evaluation> findAllEvaluationsForAnneeScolaireNiveauAndSemestre(
            AnneeScolaire anneeScolaire,
            Niveau niveau,
            Semestre semestre
    );
}
