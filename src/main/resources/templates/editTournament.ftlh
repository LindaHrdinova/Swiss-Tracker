[#ftl]
[@l.page title=" - upravit turnaj"]
    <h1>Upravit turnaji</h1>
    <div>
        <form class="form" method="post" action="/">
            <div class="form__inputBox">
                <label class="form__label" for="tournamentName">Název turnaje *</label>
                <input type="text" name="tournamentName"
                       value=${tournament.tournamentName} required>
            </div>
            <div class="form__inputBox">
                <label class="form__label" for="tournamentOrganizer">Pořadatel *</label>
                <input type="text" name="tournamentOrganizer"
                       value=${tournament.tournamentOrganizer} required>
            </div>
            <div class="form__inputBox">
                <label class="form__label" for="tournamentDate">Datum turnaje</label>
                <input type="date" name="tournamentDate" value=${tournament.tournamentDate}>
            </div>
            <div  class="form__inputBox">
                <label class="form__label" for="tournamentType">Typ turnaje *</label>
                <select class="form__select" name="tournamentType" required>
                    <option value="pokemon">Pokémon</option>
                </select>
            </div>
            <div class="form__inputBox">
                <label class="form__label" for="tournamentRounds">Počet kol *</label>
                <input type="number" min="1" max="10" name="tournamentRounds"
                       value=${tournament.tournamentRounds} required>
            </div>
            <div class="button-container">
                <button class="button" type="submit">Potvrdit změny</button>
            </div>
        </form>
    </div>
[/@l.page]