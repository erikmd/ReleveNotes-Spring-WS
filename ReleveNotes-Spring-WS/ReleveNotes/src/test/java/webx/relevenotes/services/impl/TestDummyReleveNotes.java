package webx.relevenotes.services.impl;

import webx.relevenotes.domain.Evaluation;
import webx.relevenotes.domain.nomenclature.AnneeScolaire;
import webx.relevenotes.domain.nomenclature.Niveau;
import webx.relevenotes.domain.nomenclature.Semestre;
import junit.framework.TestCase;

import java.util.List;

/**
 * @author franck Silvestre
 */
public class TestDummyReleveNotes extends TestCase{

    public void testFindAllEvaluation() {
        DummyReleveNotesService dummyReleveNotesService = new DummyReleveNotesService();
        List<Evaluation> evals = dummyReleveNotesService.findAllEvaluationsForAnneeScolaireNiveauAndSemestre(new AnneeScolaire("2012-2013"),new Niveau("Master"), new Semestre(2));
        assert evals != null ;
    }

}
