import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {forkJoin, Observable} from "rxjs";
import {User} from "../../entity/user";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private serviceUrl: string = "http://localhost:8080/api/store/users";

  constructor(private _httpClient: HttpClient) {
  }

  getAllUsers(): Observable<User[]> {
    return this._httpClient.get<User[]>(this.serviceUrl);
  }

  saveUser(user: User): Observable<User> {
    return this._httpClient.post<User>(this.serviceUrl, user);
  }

  getUserByName(username: any): Observable<User> {
    return this._httpClient.get<User>(`${this.serviceUrl}/${username}`);
  }

  deleteUser(username: string): Observable<User> {
    console.log("user to delete: " + username);
    console.log(`${this.serviceUrl}/${username}`);
    return this._httpClient.delete<User>(`${this.serviceUrl}/${username}`);
  }

  deleteUsers(users: User[]): Observable<User[]> {
    return forkJoin(
      users.map((user) =>
        this._httpClient.delete<User>(`${this.serviceUrl}/${user.username}`)
      )
    );
  }

  updateUser(user: User) {
    return this._httpClient.put(`${this.serviceUrl}/${user.username}`, user);
  }
}
